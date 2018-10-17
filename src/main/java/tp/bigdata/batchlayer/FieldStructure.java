package tp.bigdata.batchlayer;

import java.util.List;

public interface FieldStructure {
	public boolean isValidTarget(String[] dirs);
	public void fillTarget(List<String> ret, Object val);
}
