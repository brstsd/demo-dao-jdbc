package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	//responsável por inserir no banco de dados o obj, que está como parametro de entarda
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	//consulta no banco de dados com o id indicado
	Seller findById(Integer id);
	List<Seller> findaAll();
}
