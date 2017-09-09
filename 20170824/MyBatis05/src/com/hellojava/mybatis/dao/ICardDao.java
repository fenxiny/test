package com.hellojava.mybatis.dao;

import java.util.List;

import com.hellojava.mybatis.entity.Card;

public interface ICardDao {
	public List<Card> loadAll();
	public Card loadById(int cardId);
}
