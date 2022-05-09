package com.callor.app.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.dbconfig.DBContract;
import com.callor.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	/*
	 * Exception 처리하는 두가지 방법
	 * 1. Exception이 발생할 만한 코드를 try-catch로 묶어주는 방법
	 * 2. Exception을 나를 호출한 곳으로 던지기
	 * 
	 * Service에서 다음과 같이 selectAll()을 호출할 것이다
	 * List<StudentVO> stList = dao.selectAll();
	 * dao.selectAll() 에서 exception 이 발생하면
	 * dao.selectAll() 에서 exception 을 직접 처리(핸들링)하지 않고
	 * Service로 exception 던지기(전달)하여 exception을 모아서 처리하기
	 */
	public List<StudentVO> selectAll() throws SQLException{
		
		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
	}
	
	private StudentVO getResult(ResultSet rSet) {
		List<StudentVO> stList = new ArrayList<>();
		while(rSet.next()) {
			StudentVO stVO = StudentVO.builder()
							.stNum(rSet.getString(DBContract.ST_COL.))
							.stName(null)
							.stDept(null)
							.stGrade(0)
							.stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
							.stTel(rSet.getString(DBContract.ST_COL.ST_TEL))
							.build();
		}
		
		return null;
	}

}