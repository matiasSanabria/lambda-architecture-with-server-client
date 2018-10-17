package tp.bigdata.batchlayer.schema.factories;

public interface Factory<T> {
	public T build(long id);
}
