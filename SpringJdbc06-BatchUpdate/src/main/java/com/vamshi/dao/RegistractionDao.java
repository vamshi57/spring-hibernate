package com.vamshi.dao;

import java.util.List;

import com.vamshi.bo.PassengerBo;

public interface RegistractionDao {
	int[] batchInsert(List<PassengerBo> pbo);

}
