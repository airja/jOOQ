/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSearchBook extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = -176305171;

	/**
	 * The parameter <code>public.f_search_book.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

	/**
	 * The parameter <code>public.f_search_book.p_title</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> P_TITLE = createParameter("p_title", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>public.f_search_book.p_limit</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Long> P_LIMIT = createParameter("p_limit", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The parameter <code>public.f_search_book.p_offset</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Long> P_OFFSET = createParameter("p_offset", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * Create a new routine call instance
	 */
	public FSearchBook() {
		super("f_search_book", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_TITLE);
		addInParameter(P_LIMIT);
		addInParameter(P_OFFSET);
	}

	/**
	 * Set the <code>p_title</code> parameter IN value to the routine
	 */
	public void setPTitle(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.FSearchBook.P_TITLE, value);
	}

	/**
	 * Set the <code>p_title</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public FSearchBook setPTitle(org.jooq.Field<java.lang.String> field) {
		setField(P_TITLE, field);
		return this;
	}

	/**
	 * Set the <code>p_limit</code> parameter IN value to the routine
	 */
	public void setPLimit(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.FSearchBook.P_LIMIT, value);
	}

	/**
	 * Set the <code>p_limit</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public FSearchBook setPLimit(org.jooq.Field<java.lang.Long> field) {
		setField(P_LIMIT, field);
		return this;
	}

	/**
	 * Set the <code>p_offset</code> parameter IN value to the routine
	 */
	public void setPOffset(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.FSearchBook.P_OFFSET, value);
	}

	/**
	 * Set the <code>p_offset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public FSearchBook setPOffset(org.jooq.Field<java.lang.Long> field) {
		setField(P_OFFSET, field);
		return this;
	}
}
