/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package coderetreatekotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testWorldExist() {
        val classUnderTest = World(listOf())
        assertNotNull(classUnderTest, "there is a world")
    }

    @Test fun testWorldHasACell() {
        val world= World(listOf(listOf(true)))
        assertEquals(world.tick(), listOf(listOf(false)))
        assertEquals(world.tick(), listOf(listOf(false)))
    }


}
