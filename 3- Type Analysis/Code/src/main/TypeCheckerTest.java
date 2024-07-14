package main;

import main.FunctionCraft;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class TypeCheckerTest {
    private int testCaseNumber;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void assertEqualErrors() throws IOException {

        String[] args = new String[]{"samples/input/sample" + testCaseNumber + ".fl"};
        String expectedOutputPath = "samples/output/out" + testCaseNumber + ".txt";

        FunctionCraft.main(args);

        Path path = Paths.get(expectedOutputPath);
        String actualOutput = outputStream.toString().trim();
        String expectedOutput = Files.readString(path).trim();

        assertEquals(expectedOutput, actualOutput);
    }

//    @Test
//    public void several_type_check_errors() {
//        testCaseNumber = 0;
//    }
//
//    @Test
//    public void access_index_is_not_int_in_left_value() {
//        testCaseNumber = 1;
//    }
//
//    @Test
//    public void operands_of_operator_must_be_the_same_in_a_function() {
//        testCaseNumber = 2;
//    }
//
//    @Test
//    public void access_index_is_not_int_in_right_value() {
//        testCaseNumber = 3;
//    }
//
//    @Test
//    public void type_of_an_identifier_change_after_assignment() {
//        testCaseNumber = 4;
//    }
//
//    @Test
//    public void call_function_with_function_pointer() {
//        testCaseNumber = 5;
//    }

    //TODO: it is not parsed in the grammar
//
//    @Test
//    public void call_a_function_pointer_after_a_list_indexing() {
//        testCaseNumber = 6;
//    }
//
//    @Test
//    public void list_with_different_element_types_gives_error() {
//        testCaseNumber = 7;
//    }
//
//    @Test
//    public void the_chain_of_three_operands_does_not_have_the_same_type() {
//        testCaseNumber = 8;
//    }
//
//    @Test
//    public void the_chain_of_five_operands_with_two_branches_in_ast_does_not_have_the_same_type() {
//        testCaseNumber = 20;
//    }
//
//    @Test
//    public void return_type_of_function_is_correct() {
//        testCaseNumber = 9;
//    }
//
//    @Test
//    public void adding_a_function_call_with_a_void_return_type_to_an_integer() {
//        testCaseNumber = 10;
//    }
//
//    @Test
//    public void type_check_error_in_a_expression_as_a_function_call_argument() {
//        testCaseNumber = 11;
//    }
//
//    @Test
//    public void function_return_type_is_no_type_as_same_as_its_argument() {
//        testCaseNumber = 12;
//    }
//
//    @Test
//    public void different_return_type_with_return_statement_within_if_body() {
//        testCaseNumber = 14;
//    }
//
//    @Test
//    public void different_return_type_with_return_statement_within_loop_body() {
//        testCaseNumber = 15;
//    }

    @Test
    public void different_return_type_for_main_function_with_return_statement_within_loop_body() {
        testCaseNumber = 16;
    }

    @Test
    public void two_different_return_types_and_one_of_them_is_no_type() {
        testCaseNumber = 13;
    }

//    @Test
//    public void three_different_return_types_and_one_of_them_is_no_type() {
//        testCaseNumber = 21;
//    }

    @Test
    public void different_return_type_in_function_if_body_in_main() {
        testCaseNumber = 17;
    }
//
//    @Test
//    public void more_than_two_return_types_in_function_call() {
//        testCaseNumber = 18;
//    }

//    @Test
//    public void more_than_two_return_types_in_main() {
//        testCaseNumber = 19;
//    }
//
//    @Test
//    public void same_operand_error_in_inner_expressions_and_not_in_outer_expressions() {
//        testCaseNumber = 22;
//    }
//
//    @Test
//    public void same_operand_error_in_inner_expressions_and_not_in_outer_expression() {
//        testCaseNumber = 23;
//    }
//
//    @Test
//    @Disabled
//    public void list_with_different_element_types_gives_error_in_for_range() {
//        testCaseNumber = 24;
//    }
//
//    @Test
//    public void same_operand_error_when_for_range_is_list() {
//        testCaseNumber = 25;
//    }
//
//    @Test
//    public void same_operand_error_when_for_range_is_variable() {
//        testCaseNumber = 26;
//    }
//
//    @Test
//    public void no_same_operand_error_when_for_range_is_double_dot() {
//        testCaseNumber = 27;
//    }
//
//    @Test
//    public void no_error_when_the_for_variable_has_no_type() {
//        testCaseNumber = 40;
//    }
//
//    @Test
//    public void not_changing_previous_scope_variable_types_in_function_call() {
//        testCaseNumber = 29;
//    }
//
//    @Test
//    public void call_twice_a_function_with_error() {
//        testCaseNumber = 30;
//    }
//
//    @Test
//    public void unsupported_type_cannot_be_pushed() {
//        testCaseNumber = 31;
//    }
//
//    @Test
//    public void no_error_in_push_element() {
//        testCaseNumber = 32;
//    }
//
//    @Test
//    public void mis_match_push_arguments() {
//        testCaseNumber = 33;
//    }
//
//    @Test
//    public void no_error_in_pushing_to_empty_initialized_list() {
//        testCaseNumber = 34;
//    }
//
//    @Test
//    public void mis_match_push_arguments_error_in_pushing_to_empty_initialized_list() {
//        testCaseNumber = 35;
//    }
//
//    @Test
//    public void no_error_in_accessing_list_elements_in_expressions() {
//        testCaseNumber = 36;
//    }
//
//    @Test
//    public void same_operand_error_in_accessing_list_elements_in_expression() {
//        testCaseNumber = 37;
//    }
//
//    @Test
//    public void same_operand_error_in_accessing_empty_initialized_list_elements_in_expression() {
//        testCaseNumber = 38;
//    }
//
//    @Test
//    public void len_argument_error() {
//        testCaseNumber = 39;
//    }
//
//    @Test
//    public void push_to_no_type() {
//        testCaseNumber = 41;
//    }

//    @Test
//    public void change_scope_within_for_loop_works() {
//        testCaseNumber = 28;
//    }

//    @Test
//    public void change_scope_within_do_loop_works() {
//        testCaseNumber = 42;
//    }

//    @Test
//    public void change_scope_within_if_statement_works() {
//        testCaseNumber = 43;
//    }

//    @Test
//    public void pass_no_type_as_index() {
//        testCaseNumber = 44;
//    }

//    @Test
//    public void pass_no_type_as_input_of_len() {
//        testCaseNumber = 45;
//    }

//    @Test
//    public void pass_no_type_as_input_of_push() {
//        testCaseNumber = 46;
//    }

//    @Test
//    public void no_type_as_element_of_list_wont_count_as_different_type() {
//        testCaseNumber = 47;
//    }

    @Test
    public void error_in_pattern_conditions() {
        testCaseNumber = 48;
    }
    @Test
    public void type_of_default_arguments_are_correct() {
        testCaseNumber = 49;
    }

    @Test
    public void different_return_types_in_pattern_declaration() {
        testCaseNumber = 50;
    }
}
