package utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericApplicationContext;

public class BeanDefinitionUtils {
	public static void printBeanDefinitions(GenericApplicationContext cwac) {
		List<List<String>> roleBeanInfos = new ArrayList<List<String>>();
		roleBeanInfos.add(new ArrayList<String>());
		roleBeanInfos.add(new ArrayList<String>());
		roleBeanInfos.add(new ArrayList<String>());
		
		for(String name : cwac.getBeanDefinitionNames()) {
			int role = cwac.getBeanDefinition(name).getRole();
			List<String> beanInfos = roleBeanInfos.get(role);
			//role : 0 = application role
			//role : 2 = infrastructure role
			beanInfos.add("role["+ role + "] : name[" + name + "] : className[" + cwac.getBean(name).getClass().getName() +"]");
		}
		
		for(List<String> beanInfos : roleBeanInfos) {
			System.out.println("###############################################################################################################################################################################################");
			for(String beanInfo : beanInfos) {
				System.out.println("===============================================================================================================================================================================================");
				System.out.println(beanInfo);
			}
			System.out.println("###############################################################################################################################################################################################");
			System.out.println("");
		}
	}
}
