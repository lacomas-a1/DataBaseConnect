package com.db.DataBase.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.db.DataBase.Model.DataModel;
import com.db.DataBase.Repository.DataRepository;
import com.db.DataBase.Service.DataService;


@Service
public class DataServiceImpl implements DataService {
	
	private DataRepository dataRepository;
	
	public DataServiceImpl(DataRepository dataRepository) {
		super();
		this.dataRepository = dataRepository;
	}

	@Override
	public List<DataModel> getAllStudentModels() {
		// TODO Auto-generated method stub
		return dataRepository.findAll();
	}

}
