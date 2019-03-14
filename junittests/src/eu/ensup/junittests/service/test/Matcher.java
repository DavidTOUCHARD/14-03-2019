package eu.ensup.junittests.service.test;


import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class Matcher {
	int x= 0;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void matchers()
	{
		assertThat(x, not(3));
//		assertThat(x, Is(not(4)));
//		assertThat(responseString, either(containsString("color")).or(containsString("colour")));
//		assertThat(myList, hasItem("3"));
	}

}
//tests