package com.multi.mvc200;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
	@RequestMapping("jasonResponse5")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄,
	public MapControllerVO kakaoMap() {
		MapControllerVO bag = new MapControllerVO();
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		System.out.println(bag);
		return bag;
	}
	
	
        }


