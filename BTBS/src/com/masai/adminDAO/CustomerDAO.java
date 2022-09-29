package com.masai.adminDAO;

import java.util.List;

import com.masai.bean.Bus;

public interface CustomerDAO {

	public List<Bus> searchBuses(String source,String destination);
}
