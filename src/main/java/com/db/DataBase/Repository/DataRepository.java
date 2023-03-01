package com.db.DataBase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.DataBase.Model.DataModel;

public interface DataRepository extends JpaRepository<DataModel, Long> {

}
