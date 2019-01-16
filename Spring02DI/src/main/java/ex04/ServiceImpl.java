package ex04;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ServiceImpl implements Service {

	List<String> list;
	Map<String, Integer> map;
	Set<String> set;
	Properties prop;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		for(String s:list)
			System.out.println(s);
		System.out.println("---------------");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key=it.next();
			Integer val=map.get(key);
			System.out.println(key+": "+val);
		}
		System.out.println("---------------");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("---------------");
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		String ip=prop.getProperty("user");
		String port=prop.getProperty("pwd");
		System.out.println("user: "+ip+", pwd:"+port);
		System.out.println("---------------");
	}

}
