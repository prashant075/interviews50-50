package z_lld.test;

import java.util.List;

interface SuggestionIndex {
    /**
     * Adds a token to the index.
     *
     * @param token A term that should be returned when the user looks for it.
     */
    void add(String token);

    /**
     * Finds the tokens that were indexed before when they start with the given prefix.
     * If there is no such input, return an empty array.
     * This method should be efficient; it's expected that it will be called much more often than the indexing operations.
     *
     * @param prefix Some input from the user
     * @return The found tokens
     */
    List<String> find(String prefix);
}