package example;

import java.util.List;
import java.util.Map;

public class XmlBean3 {
	
	private Integer id;
	private String name;
	private List<String> list;
	private Map<Integer,String> map;

	public XmlBean3() {
		super();
	}
	public XmlBean3(Integer id, String name, List<String> list, Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.map = map;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "XmlBean3 [id=" + id + ", name=" + name + ", list=" + list + ", map=" + map + "]";
	}

	

}
