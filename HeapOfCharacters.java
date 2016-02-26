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
   public Character removeRoot(){
       Character root = heap.get(1);
       heap.remove(1);
       heap.set(1,heap.get(heap.size()-1));
       bubbleDown();
       return root;
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
   private void bubbleDown()
   {
       int curIndex=1;
       int swapIndex=1;
       Character leftChild = heap.get(curIndex*2);
       Character rightChild = heap.get(curIndex*2+1);
       Character cur = heap.get(curIndex);
       while((curIndex*2<heap.size()-1) && (cur.compareTo(leftChild)<0 || cur.compareTo(rightChild)<0)){
           swapIndex = -1;
           rightChild = heap.get(curIndex*2+1);
           leftChild = heap.get(curIndex*2);
           cur = heap.get(curIndex);
           if(curIndex*2+1<heap.size()+1){
               if(rightChild.compareTo(leftChild)<0){
                   swapIndex = curIndex*2+1;
                }
               else{
                   swapIndex = curIndex*2;
                }
            }
            else if(leftChild.compareTo(cur)<0){
                swapIndex = curIndex*2;
            }
           if(swapIndex!=-1){
               heap.set(swapIndex,cur);
               heap.set(curIndex, heap.get(swapIndex));
               curIndex = swapIndex;
            }
        }
       
   }
} 