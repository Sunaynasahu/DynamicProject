package in.co.rays.test;

	import java.util.Iterator;
	import java.util.List;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

	public class TestMarksheet {
		

		public static void main(String[] args) throws Exception {
			// testAdd();
			// testUpdate();
			// testDelete();
			// testFindByRoll();
			testSearch();

		}

		private static void testSearch() throws Exception {
			MarksheetBean bean = new MarksheetBean();
			bean.setName("a");
			//bean.setId(1);
			//bean.setRollNo(101);
		MarksheetModel model = new MarksheetModel();
	    List list = model.Search(bean, 1,5);
			Iterator it = list.iterator();
			while (it.hasNext()) {
			
				//MarksheetBean bean = (MarksheetBean) it.next();
				
				bean = (MarksheetBean) it.next();
				System.out.print(bean.getId());
				System.out.print("\t" + bean.getName());
				System.out.print("\t" + bean.getRollNo());
				System.out.print("\t" + bean.getPhysics());
				System.out.print("\t" + bean.getChemistry());
				System.out.println("\t" + bean.getMaths());

			}

		}

		private static void testFindByRoll() throws Exception {
			MarksheetModel model = new MarksheetModel();
			MarksheetBean bean = model.findByRoll(102);

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());

		}

		private static void testDelete() throws Exception {
			MarksheetModel model = new MarksheetModel();
			model.delete(18);

		}

		private static void testUpdate() throws Exception {

			MarksheetBean bean = new MarksheetBean();
			bean.setId(17);
			bean.setName("anaya");

			MarksheetModel model = new MarksheetModel();
			model.update(bean);
		}

		private static void testAdd() throws Exception {
			MarksheetBean bean = new MarksheetBean();
			
			//bean.setId(18);
			bean.setName("palak");
			bean.setRollNo(118);
			bean.setPhysics(38);
			bean.setChemistry(67);
			bean.setMaths(70);
			MarksheetModel model = new MarksheetModel();
			model.add(bean);
		}

	}


