package uy.klutter.core.collections

import java.io.Serializable
import java.util.*

// based off of the answer from @miensol in this Stackoverflow answer http://stackoverflow.com/a/37936456/3679676

/**
 * Wraps an Iterator with a lightweight delegating class that prevents casting back to mutable type
*/
class ImmutableIterator <T> (private val delegate: Iterator<T>) : Iterator<T> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }
}

/**
 * Wraps a Collection with a lightweight delegating class that prevents casting back to mutable type
 */
class ImmutableCollection <T> (private val delegate: Collection<T>) : Collection<T> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }

    override fun iterator(): Iterator<T> {
        return delegate.iterator().asImmutable()
    }
}

/**
 * Wraps a ListIterator with a lightweight delegating class that prevents casting back to mutable type
 */
class ImmutableListIterator <T> (private val delegate: ListIterator<T>): ListIterator<T> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }
}

/**
 * Wraps a List with a lightweight delegating class that prevents casting back to mutable type
 */
open class ImmutableList <T>(private val delegate: List<T>) : List<T> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }

    override fun iterator(): Iterator<T> {
        return delegate.iterator().asImmutable()
    }

    override fun listIterator(): ListIterator<T> {
        return delegate.listIterator().asImmutable()
    }

    override fun listIterator(index: Int): ListIterator<T> {
        return delegate.listIterator(index).asImmutable()
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        return delegate.subList(fromIndex, toIndex).asImmutable()
    }
}

/**
 * Wraps a List that is also RandomAccess with a delegating class that prevents casting back to mutable type
 */
class ImmutableRandomAccessList <T> (delegate: List<T>): ImmutableList<T>(delegate), List<T>, RandomAccess, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }
}

/**
 * Wraps a Set with a lightweight delegating class that prevents casting back to mutable type
 */
class ImmutableSet <T>(private val delegate: Set<T>) : Set<T> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }

    override fun iterator(): Iterator<T> {
        return delegate.iterator().asImmutable()
    }
}

/**
 * Wraps a Map with a lightweight delegating class that prevents casting back to mutable type
 */
class ImmutableMap <K : Any, V>(private val delegate: Map<K, V>) : Map<K, V> by delegate, Serializable {
    companion object {
        @JvmField val serialVersionUID = 1L
    }

    override val keys: Set<K>
        get() = delegate.keys.asImmutable()
    override val values: Collection<V>
        get() = delegate.values.asImmutable()
    override val entries: kotlin.collections.Set<kotlin.collections.Map.Entry<K, V>>
        get() = delegate.entries.asImmutable()
}

/**
 * Wraps the Iterator with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> Iterator<T>.asImmutable(): Iterator<T> = if (this is ImmutableIterator) this else ImmutableIterator(this)

/**
 * Wraps the ListIterator with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> ListIterator<T>.asImmutable(): ListIterator<T> = if (this is ImmutableListIterator) this else ImmutableListIterator(this)

/**
 * Wraps the Collection with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> Collection<T>.asImmutable(): Collection<T> = if (this is ImmutableCollection) this else ImmutableCollection(this)

/**
 * Wraps the List with a lightweight delegating class that prevents casting back to mutable type,
 * specializing for the case of the RandomAccess marker interface being retained if it was there originally
 */
fun <T> List<T>.asImmutable(): List<T> {
    return when (this) {
        is ImmutableList -> this
        is RandomAccess -> ImmutableRandomAccessList(this)
        else -> ImmutableList(this)
    }
}

/**
 * Wraps the List as a Collection with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> List<T>.asImmutableCollection(): Collection<T> = ImmutableCollection(this)

/**
 * Wraps the Set with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> Set<T>.asImmutable(): Set<T> = if (this is ImmutableSet) this else ImmutableSet(this)

/**
 * Wraps the Set as a Collection with a lightweight delegating class that prevents casting back to mutable type
 */
fun <T> Set<T>.asImmutableCollection(): Collection<T> = ImmutableCollection(this)

/**
 * Wraps the Map with a lightweight delegating class that prevents casting back to mutable type
 */
fun <K : Any, V> Map<K, V>.asImmutable(): Map<K, V> = if (this is ImmutableMap) this else ImmutableMap(this)