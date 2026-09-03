/**
 * Book kernel component with primary methods.
 *
 * @mathsubtypes {@code
 *      BOOK is (
 *      title: string of chararacter,
 *      author: string of character
 *      genre: string of character
 *      pages: integer
 *      isbn: java.math.BigInteger)
 * }
 * @mathmodel type book is modeled by BOOK
 */
public interface BookKernel {

    /**
     * Adds book b to this.
     *
     * @param b
     *            book to add
     * @updates this
     *
     */
    void addBook(book b);

    /**
     * Removes book b from this.
     *
     * @param b
     *            book to be removed
     * @updates this
     */
    void removeBook(book b);

    boolean hasBook(book b);

    book getBook(int i);

    int length();

}
