package eu.ensup.junittests.service.test;

import static org.junit.Assert.*;

import org.junit.Test;
/*
import  org.hamcrest.Matchers.hasProperty;
import  org.hamcrest.Matchers.is;
import  org.hamcrest.Matchers.startsWith;*/
import org.hamcrest.core.*;
//import org.hamcrest.CoreMatchers.*;
import org.hamcrest.*;

/*import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;*/
import javax.*;
/*
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrow() {
        TestThing testThing = new TestThing();
        thrown.expect(NotFoundException.class);
       thrown.expectMessage(startsWith("some Message"));
        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        testThing.chuck();
    }

    private class TestThing {
        public void chuck() {
            Response response = Response.status(Status.NOT_FOUND).entity("Resource not found").build();
            throw new NotFoundException("some Message", response);
        }
    }
}
*/