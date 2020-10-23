package com.input;

import java.net.InetAddress;

public class GetIPAddress
{
    public static void main(String[] args) throws Exception
    {
        /* Public static InetAddress getLocalHost()
         * thrown UnknownHostException: returns the address
         * of the local host. This is achieved by retrieving
         * the name of the host from the system, then resolving
         * that name into an InetAddress. Note: the resolved
         * address may be cached for a short period of time.
         */

        InetAddress myIP = InetAddress.getLocalHost();

        /* Public String getHostAddress(): returns the IP
         * address string in textual presentation.
         */

        System.out.println("My IP Address is: ");
        System.out.println(myIP.getHostAddress());
    }
}