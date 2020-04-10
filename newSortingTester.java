import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class newSortingTester {
@Test
public void SortingTester1() {//basic tester
	int[] a = {5,3,4,1,2};
	SortingAssignment.newSorting(a,a.length);
	int[] sol = {1,2,3,4,5};
	assertArrayEquals(sol,a);
}
@Test
public void SortingTester2() {//larger array
	int[] a = {-2,6,3,9,2,0};
	SortingAssignment.newSorting(a,a.length);
	int[] sol = {-2,0,2,3,6,9};
	assertArrayEquals(sol,a);
}
@Test
public void SortingTester3() {//negative tester
	int[] a = {-9,-6,-3,-1,0};
	SortingAssignment.newSorting(a,a.length);
	int[] sol = {-9,-6,-3,-1,0};
	assertArrayEquals(sol,a);
}
@Test
public void SortingTester4() {//repetition negative tester  
	int[] a = {-3,-3,-3};
	SortingAssignment.newSorting(a,a.length);
	int[] sol = {-3,-3,-3};
	assertArrayEquals(sol,a);
}
@Test
public void SortingTester5() {//one index tester
	int[] a = {0};
	SortingAssignment.newSorting(a,a.length);
	int[] sol = {0};
	assertArrayEquals(sol,a);
}
}
