package db;

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// constructor
	public DbException(String msg) {
		super(msg);
	}

}
