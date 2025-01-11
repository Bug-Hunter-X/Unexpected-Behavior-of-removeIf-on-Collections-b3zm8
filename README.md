# Unexpected Behavior of removeIf on Collections in Kotlin

This example demonstrates a potential pitfall when using the `removeIf` function on mutable collections (Lists, Maps, Sets) in Kotlin.  If you modify the collection structure while iterating, the behavior may not be what you expect.

The `Bug.kt` file contains code that shows the unexpected behavior. The `BugSolution.kt` provides a solution.