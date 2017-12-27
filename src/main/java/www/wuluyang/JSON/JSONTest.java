package www.wuluyang.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONTest {
	//通过fastJSON封装JSON
	public static void main(String[] args) {
//		setFastJSON();
	//	setMapToJSON();
		setBeanToJSON();
	}
	public static void setFastJSON(){
		
		JSONObject root = new JSONObject();
		root.put( "hao", "吴陆阳");
		root.put( "haha", "吴越");
		JSONArray arr=new JSONArray();
		JSONObject user = new JSONObject();
		user.put(  "aa", "我的");
		user.put( "bb", "她的");
		user.put( "cc", "啧啧");
		user.put( "dd", "昨天");
		user.put(  "ee" , "今日");
		arr.add(user);
		root.put("ar", arr);
		System.out.println(root.toJSONString());
	}
		public static void setMapToJSON(){
		 HashMap<String, Object> root =	new HashMap<String, Object>();
		 root.put("hao", 1);
		 root.put("bb", "她的");
		 root.put("ss", "昨天");
		 
		 List<Map<String,Object>> dataArr=new ArrayList<Map<String,Object>>();
		 Map<String, Object> userWu=new HashMap<String, Object>();
		 userWu.put("h", "不爽");
		 userWu.put("o", "嗯哼");
		 userWu.put("ee", "的");
		 dataArr.add(userWu);
		 root.put("dataArr", dataArr);
		 System.out.println(new JSONObject().toJSONString(root));
	}
		
		//通过实体类转换JSON
		public static void setBeanToJSON(){
			Root root=new Root();
			root.setErrorCode("0");
			root.setErrorMsg("封航");
			List<User> data = new ArrayList<User>();
			User user=new User();
			user.setPosition("上");
			user.setUserName("皇上");
			user.setWebAddress("龙");
			data.add(user);
			root.setData(data);
			System.out.println(new JSONObject().toJSONString(root));
		}
		}

