//Listing 10.7
//********************************************************************
//  HeapOfCharacters.java       Author: Lewis/Loftus/Cocking
//
//  Implements a heap of characters.
//********************************************************************

import java.util.ArrayList;

public class HeapOfCharacters
{
   private ArrayList<Character> heap;

   //-----------------------------------------------------------------
   //  Sets up an empty heap.
   //-----------------------------------------------------------------
   public HeapOfCharacters ()
   {
      heap = new ArrayList<Character>();
      heap.add(null); // add a "dummy" element in position 0
   }

   //-----------------------------------------------------------------
   //  Returns a string representing this heap.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return heap.toString();
   }

   //-----------------------------------------------------------------
   //  Adds an element to the heap.
   //-----------------------------------------------------------------
   public void add (Character ch)
   {
      heap.add(ch);
      bubbleUp();
   }

   //-----------------------------------------------------------------
   //  Bubbles the last element up as necessary to preserve
   //  the ordering of the heap.
   //-----------------------------------------------------------------
   private void bubbleUp ()
   {
      int curIndex = heap.size() - 1;
      int parentIndex = curIndex / 2;
      Character cur = heap.get(curIndex);

      while ((curIndex > 1) &&
             (cur.compareTo(heap.get(parentIndex)) < 0))
      {
         // Swap current element with its parent
         Character parent = heap.get(parentIndex);
         heap.set(parentIndex, cur);
         heap.set(curIndex, parent);

         curIndex = parentIndex;
         parentIndex = curIndex / 2;
      }
   }
} 