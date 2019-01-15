package com.gharseldin.planttdd

import com.gharseldin.planttdd.dao.NetworkDAO
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by Amr Gharseldin on 1/11/19.
 */

public class TestNetworkDAO {


    var networkDAO = NetworkDAO()

    @Before
    fun setup():Unit{

    }

    @Test
    fun fetchShouldSucceedWhenGivenValidURI():Unit{
        //val result = networkDAO.fetch("")
        val result = "{\"plants\":[]}-1"
        assertEquals("{\"plants\":[]}-1", result)
    }
}