package com.wea.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.wea.Beans.Data;
import com.wea.Tools.DateUtil;
import com.wea.Tools.JDBCDBCPUtil;

public class DataDao {

	public static void insertData(Data data) {
		Connection conn = null;
		String sql = "insert into t_data(date,time,temperature,humidity,SO2,O3,dust,voice,path) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, (Date) data.getDate());
			stmt.setString(2, data.getTime());
			stmt.setFloat(3, data.getTemperature());
			stmt.setFloat(4, data.getHumidity());
			stmt.setFloat(5, data.getSO2());
			stmt.setFloat(6, data.getO3());
			stmt.setFloat(7, data.getDust());
			stmt.setFloat(8, data.getVoice());
			stmt.setString(9, data.getPath());
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, null);
		}
	}
	public static List<Data> findDayData(Date date) {

		List dayData = new ArrayList();
		Data data = null;
		Connection conn = null;
		String sql = "select * from t_data where date=?";
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, date);
			rs = stmt.executeQuery();
			while (rs.next()) {
				data = new Data();
				data.setId(rs.getInt(1));
				data.setDate(rs.getDate(2));
				data.setTime(rs.getString(3));
				data.setTemperature(rs.getFloat(4));
				data.setHumidity(rs.getFloat(5));
				data.setSO2(rs.getFloat(6));
				data.setO3(rs.getFloat(7));
				data.setDust(rs.getFloat(8));
				data.setVoice(rs.getFloat(9));
				data.setPath(rs.getString(10));
				dayData.add(data);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, rs);

		}

		return dayData;

	}

	// 获得平均数值 0--温度 1--湿度 2--声音
	public static float getAvgDay(Date date, int type) {
		float sum = 0;
		float avg = 0;
		List<Data> list = findDayData(date);
		int count = list.size();
		for (int i = 0; i < count; i++) {
			if (type == 0) {
				System.out.println(i + "==" + list.get(i).getTemperature());
				sum = sum + list.get(i).getTemperature();
			}
			if (type == 1) {
				System.out.println(i + "==" + list.get(i).getHumidity());
				sum = sum + list.get(i).getHumidity();
			}
			if (type == 2) {
				System.out.println(i + "==" + list.get(i).getVoice());
				sum = sum + list.get(i).getVoice();
			}
		}
		System.out.println("sum==" + sum);
		System.out.println("count==" + count);
		avg = sum / count;
		switch (type) {
		case 0:
			insertAvgTemp(date, avg);
			break;

		case 1:
			insertAvgHumi(date, avg);
			break;

		case 2:
			insertAvgVoice(date, avg);
			break;
		default:
			break;
		}
		return avg;
	}

	// 获取最新插入数据的id
	private static int getLastId() {
		int id = 0;
		Connection conn = null;
		String sql = "select max(id) from t_data";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, null);
		}

		return id;
	}

	// 获得最新数据
	public static Data getLastestData() {
		Data data = null;
		Connection conn = null;
		String sql = "select * from t_data where id=?";
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, getLastId());
			rs = stmt.executeQuery();
			while (rs.next()) {
				data = new Data();
				data.setId(rs.getInt(1));
				data.setDate(rs.getDate(2));
				data.setTime(rs.getString(3));
				data.setTemperature(rs.getFloat(4));
				data.setHumidity(rs.getFloat(5));
				data.setSO2(rs.getFloat(6));
				data.setO3(rs.getFloat(7));
				data.setDust(rs.getFloat(8));
				data.setVoice(rs.getFloat(9));
				data.setPath(rs.getString(10));

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, rs);

		}

		return data;
	}

	// 插入日平均温度
	private static void insertAvgTemp(Date date, float temperature) {
		Connection conn = null;
		String sql = "insert into t_temperature(date,temperature) values(?,?)";
		PreparedStatement stmt = null;
		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, date);
			stmt.setFloat(2, temperature);
			int n = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, null);
		}
	}

	// 插入日平均湿度
	private static void insertAvgHumi(Date date, float humidity) {
		Connection conn = null;
		String sql = "insert into t_humidity(date,humidity) values(?,?)";
		PreparedStatement stmt = null;
		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, date);
			stmt.setFloat(2, humidity);
			int n = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, null);
		}
	}

	// 插入日平均声音
	private static void insertAvgVoice(Date date, float voice) {
		Connection conn = null;
		String sql = "insert into t_voice(date,voice) values(?,?)";
		PreparedStatement stmt = null;
		try {
			conn = JDBCDBCPUtil.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, date);
			stmt.setFloat(2, voice);
			int n = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDBCPUtil.freeConn(conn, stmt, null);
		}
	}

	/**
	 * 获得指定日期前days天的平均数据 type 0--温度 1--湿度 2--voice
	 * @param date
	 * @param days
	 * @param type
	 * @return
	 */
	public static HashMap<Date, Float> getPreAvgMap(Date date, int days, int type) {
		HashMap<Date, Float> preMap = new HashMap<Date, Float>();
		List<java.util.Date> list = DateUtil.getDateList(date, days);
		for (int i = 0; i < list.size(); i++) {
			java.util.Date temp = list.get(i);
			Date currentDate = new Date(temp.getTime());
			switch (type) {
			case 0:
				float temperature = getAvgDay(currentDate, type);
				preMap.put(currentDate, temperature);
				break;
			case 1:
				float humidity = getAvgDay(currentDate, type);
				preMap.put(currentDate, humidity);
				break;
			case 2:
				float voice = getAvgDay(currentDate, type);
				preMap.put(currentDate, voice);
				break;
			default:
				break;
			}
		}
		return preMap;

	}
}
