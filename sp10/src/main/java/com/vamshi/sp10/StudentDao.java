package com.vamshi.sp10;

import com.vamshi.object_class.StudentBO;

public interface StudentDao {

	int insert(StudentBO bo);
	StudentBO retrive(int sno);

}
