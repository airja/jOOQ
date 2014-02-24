/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBook extends java.io.Serializable {

	/**
	 * Getter for <code>public.t_book.id</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Getter for <code>public.t_book.author_id</code>.
	 */
	public java.lang.Integer getAuthorId();

	/**
	 * Getter for <code>public.t_book.co_author_id</code>.
	 */
	public java.lang.Integer getCoAuthorId();

	/**
	 * Getter for <code>public.t_book.details_id</code>.
	 */
	public java.lang.Integer getDetailsId();

	/**
	 * Getter for <code>public.t_book.title</code>.
	 */
	public java.lang.String getTitle();

	/**
	 * Getter for <code>public.t_book.published_in</code>.
	 */
	public java.lang.Integer getPublishedIn();

	/**
	 * Getter for <code>public.t_book.language_id</code>.
	 */
	public java.lang.Integer getLanguageId();

	/**
	 * Getter for <code>public.t_book.content_text</code>.
	 */
	public java.lang.String getContentText();

	/**
	 * Getter for <code>public.t_book.content_pdf</code>.
	 */
	public byte[] getContentPdf();

	/**
	 * Getter for <code>public.t_book.status</code>.
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UBookStatus getStatus();
}
