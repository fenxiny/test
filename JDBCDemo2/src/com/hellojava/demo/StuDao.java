package com.hellojava.demo;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hellojava.database.DBManager;
import com.hellojava.entity.stu;

//在DBManager基础上再次进行封装(对象化操作)
//对象型数据和关系型数据的映射
//Demo 操作stu表
//DAO Data Access Object 数据访问对象
//主要功能:ORM Object Relation Mapping 对象 -- 关系型 -- 映射
//对应一张表
public class StuDao {
	//添加数据到数据库中 stu 数据
	public int save(stu b) throws SQLException,FileNotFoundException{
		//对象到关系型数据的转换
		Connection conn=DBManager.openConnection();
		String sql="insert into stu values(?,?,?,?,?)";
		Object[] obs={b.getID(),b.getNAME(),b.getAGE(),b.getSEX()};
		int count=DBManager.update(conn, sql, obs);
		DBManager.closeConnection(conn);
		return count;
	}
	
	public int delete(stu b)throws SQLException,FileNotFoundException{
		Connection conn=DBManager.openConnection();
		String sql="delete from stu where stuId=?";
		Object[] obs={b.getID()};
		int count=DBManager.update(conn, sql, obs);
		DBManager.closeConnection(conn);
		return count;
	}
	
	public int update(stu b)throws SQLException,FileNotFoundException{
		Connection conn=DBManager.openConnection();
		String sql="update stu SET ID=?,NAME=?,AGE=?,SEX=? where ID=?";
		Object[] obs={b.getID(),b.getNAME(),b.getAGE(),b.getSEX()};
		int count=DBManager.update(conn, sql);
		DBManager.closeConnection(conn);
		return count;
	}
	
	public stu loadById(int stuId)throws SQLException,FileNotFoundException{
		stu b=null;
		Connection conn=DBManager.openConnection();
		String sql="select * from stu where stuId=?";
		Object[] obs={stuId};
		ResultSet rs=DBManager.query(conn, sql, obs);
		if(rs.next()){
			stu b1=new stu();
			b1.setID(rs.getInt("Id"));
			b1.setNAME(rs.getString("Name"));
			b1.setAGE(rs.getInt("Age"));
			b1.setSEX(rs.getString("Sex"));
		}
		DBManager.closeConnection(conn);
		return b;
	} 
	
	public List<stu> loadAll()throws SQLException,FileNotFoundException{
		List<stu> stus=new ArrayList<stu>();
		Connection conn=DBManager.openConnection();
		String sql="select * from stu";
		ResultSet rs=DBManager.query(conn, sql, null);
		while(rs.next()){
			stu b=new stu();
			b.setID(rs.getInt("Id"));
			b.setNAME(rs.getString("Name"));
			b.setAGE(rs.getInt("Age"));
			b.setSEX(rs.getString("Sex"));
			stus.add(b);
		}
		DBManager.closeConnection(conn);
		return stus;
	}
}











