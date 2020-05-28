
#include "Queue.c"

void TestLinkedListMethods();
void TestStackMethods();
void TestQueueMethods();

int main()
{
    //TestLinkedListMethods();
    //TestStackMethods();
    TestQueueMethods();

}

/**
 * @brief  A tester function for the methods in the linked list.
 * @note   
 * @retval None
 */
void TestLinkedListMethods()
{

}

/**
 * @brief  A tester function for the methods in the stack.
 * @note   
 * @retval None
 */
void TestStackMethods()
{
    push(5);
    push(50);
    push(500);
    print();
    pop();
    printf("POPPED!\n");
    print();
}

/**
 * @brief  A tester function for the methods in the queue.
 * @note   
 * @retval None
 */
void TestQueueMethods()
{
    enqueue(5);
    enqueue(50);
    enqueue(75);
    printQueue();
    dequeue();
    printQueue();
}