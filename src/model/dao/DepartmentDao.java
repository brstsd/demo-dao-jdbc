package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//responsável por inserir no banco de dados o obj, que está como parametro de entarda
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//consulta no banco de dados com o id indicado
	Department findById(Integer id);
	List<Department> findaAll();
}
