public class SQLQueries {

    private static String GET_SECOND_HIGHEST_SALARY = "\n  SELECT DISTINCT salary" +
                                                      "\n  FROM employees" +
                                                       "\n  ORDER BY salary DESC" +
                                                       "\n  LIMIT 1 OFFSET 1;";    
    
    private static String GET_ROWS_PRESENT_IN_ONE_TABLE_BUT_NOT_IN_OTHER = "\n SELECT table1.* " +
                                                                            "\n FROM table1 " +
                                                                            "\n LEFT JOIN table2 ON table1.id = table2.id " +
                                                                            "\n WHERE table2.id IS NULL; ";

    public static void main(String[] args) {

        System.out.println("Query: " + GET_ROWS_PRESENT_IN_ONE_TABLE_BUT_NOT_IN_OTHER);
    }

}
