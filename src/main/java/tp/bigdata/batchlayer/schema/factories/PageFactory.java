package tp.bigdata.batchlayer.schema.factories;

import tp.bigdata.batchlayer.schema.Page;

public class PageFactory implements Factory<Page> {

	public Page build(long id) {
		Page page = new Page();
		page.setId(id);
		return page;
	}
}
