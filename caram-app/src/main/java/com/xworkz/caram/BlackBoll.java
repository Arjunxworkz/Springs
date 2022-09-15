package com.xworkz.caram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlackBoll {
	
@Value("Sharath")	
String name;

private  BlackBoll() {
System.out.println(this.getClass().getSimpleName());	

}

@Override
public String toString() {
	return "BlackBoll [name=" + name + "]";
}


}
