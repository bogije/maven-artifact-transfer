package org.apache.maven.shared.project.install.internal;

import java.io.InputStream;

import org.junit.Test;

public class DualDigesterTest
{

    enum ChecksumTypes {
        MD5,
        SHA1,
        SHA256
    }
    @Test
    public void testName()
    {
        InputStream resourceAsStream = this.getClass().getResourceAsStream( "/test.jar" );
        
        DualDigester dd = new DualDigester();
        
        dd.calculate( file );
    }
    
}
