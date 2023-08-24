package in.co.rays.test;


	import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;

import in.co.rays.model.UserModel;
	public class TestUser {
		

		public static void main(String[] args) throws Exception {
			//testAdd();
			//testUpdate();
			testSearch();
		}

		private static void testUpdate() throws Exception {
			String dob = "1998-07-15";
			 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
				UserBean bean = new UserBean ();
				bean.setId(1);
				bean.setFirstname("Tanya");
				bean.setLastname("shakya");
				bean.setLoginId("tanya123@gmail.com");
				bean.setPassword("3214");
				bean.setDob(sdf.parse(dob));
				bean.setAddress("Bhopal");
				
						
				
				UserModel model = new UserModel();
				model.update(bean);
			
		}

		private static void testAdd() throws Exception {
			String dob = "1996-04-11";
		 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			
		UserBean bean = new UserBean();
		//bean.setId(1);
		bean.setFirstname("shantanu");
		bean.setLastname("shakya");
		bean.setLoginId("shan1232@gmail.com");
		bean.setPassword("1234");
		bean.setDob(sdf.parse(dob));
		bean.setAddress("Bhopal");
		
		
		UserModel model=new UserModel();
		model.add(bean);
		
		
			
		}

		
//		private static void testFindByPk() throws Exception {
//			UserModel model = new UserModel();
//			UserBean bean = model.findBypk();
//
//			System.out.println(bean.getId());
//			System.out.println(bean.getFirstname());
//			System.out.println(bean.getLastname());
//			System.out.println(bean.getLoginId());
//			System.out.println(bean.getPassword());
//			System.out.println(bean.getDob());
//			System.out.println(bean.getAddress());
//			
//
//		}
		private static void testSearch() throws Exception {
			UserBean bean = new UserBean();
			bean.setFirstname("annu");
			//bean.setId(1);
			
		UserModel model = new UserModel();
	    List list = model.Search(bean, 1,5);
			Iterator it = list.iterator();
			while (it.hasNext()) {
			
				//MarksheetBean bean = (MarksheetBean) it.next();
				
				bean = (UserBean) it.next();
				System.out.print(bean.getId());
				System.out.print("\t" + bean.getFirstname());
				System.out.print("\t" + bean.getLastname());
				System.out.print("\t" + bean.getLoginId());
				System.out.print("\t" + bean.getPassword());
				System.out.println("\t" + bean.getDob());
				System.out.println("\t" + bean.getAddress());
				
			}

		}



	}



