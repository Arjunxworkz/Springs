package com.xworkz.caram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WhiteBoll {
@Value("Ravi")
  String playerName;
  
  public WhiteBoll() {
	 System.out.println(getClass().getSimpleName());
}

@Override
public String toString() {
	return "WhiteBoll [playerName=" + playerName + "]";
}
    
}
