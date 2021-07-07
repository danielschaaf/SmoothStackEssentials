package com.ss.ds.jb.Tests;
import static org.junit.Assert.*;
import org.junit.Test;

import com.ss.ds.jb.five.ModString;
public class ModString_Test {


		@Test
		public void test_removeX() {
			
			assertTrue(ModString.removeX("ax").equals("a"));
			assertFalse(ModString.removeX("ax").equals("x"));
		}

	}



