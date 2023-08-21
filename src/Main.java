
public class Main {
//    It prints the elements of the array.
    public static void blockOut(int[] block) {
        for (int i = 0; i < block.length - 1; i++) {
            System.out.print(block[i] + ", ");
        }
        System.out.println(block[block.length - 1]);
    }
//      It adds an element to the array.
    public static int[] addTo(int[] block, int number) {
        int[] newBlock = new int[block.length + 1];
        for (int i = 0; i < block.length; i++) {
            newBlock[i] = block[i];
        }
        newBlock[newBlock.length - 1] = number;
        return newBlock;
    }
//      It deletes/removes an element from the array.
    public static int[] remove(int[] block, int index) {
        int[] newBlock = new int[block.length - 1];
        int blockIndex = 0;
        for (int i = 0; i < block.length; i++) {
            if (i != index) {
                newBlock[blockIndex++] = block[i];
            }
        }
        return newBlock;
    }
//      It replaces an element in the array.
    public static int[] exchange(int[] block, int index, int number) {
        int[] newBlock = new int[block.length];
        int blockIndex = 0;
        for (int i = 0; i < block.length; i++) {
            if (i == index) {
                block[i] = number;
            }
            newBlock[blockIndex++] = block[i];
        }
        return newBlock;
    }
//      It inserts an element into the array.
    public static int[] insert(int[] block, int index, int number) {
        int[] newBlock = new int[block.length + 1];
        int blockIndex = 0;
        for (int i = 0; i < block.length; i++) {
            if (i == index) {
                newBlock[blockIndex++] = number;
            }
            newBlock[blockIndex++] = block[i];
        }
        return newBlock;
    }
//      It shows whether the array contains a specific element or not.
    public static boolean contain(int[] block, int number) {
        boolean include = false;
        for (int i = 0; i < block.length; i++) {
            if (block[i] == number) {
                include = true;
                break;
            }
        }
        return include;
    }
//      It prints the common elements of the two arrays.
    public static int[] pruned(int[] block1, int[] block2) {
        int flag = 0;
        for (int number : block1) {
            if (contain(block2, number)) {
                flag++;
            }
        }
        int[] pruned = new int[flag];
        int pruIndex = 0;
        for (int number : block1) {
            if (contain(block2, number)) {
                pruned[pruIndex++] = number;
            }
        }
        return pruned;
    }
//      It prints all the elements that are present in both arrays, without repetitions.
    public static int[] union(int[] block1, int[] block2) {
        int size = block1.length;
        for (int number : block1) {
            if (!contain(block2, number)) {
                size++;
            }
        }
        int[] unionNew = new int[size];
        int unionIndex = 0;
        for (int number : block1) {
            unionNew[unionIndex++] = number;
        }
        for (int number : block1) {
            if (!contain(block2, number)) {
                unionNew[unionIndex++] = number;
            }
        }
        return unionNew;
    }
//      It prints the number of elements present in the array.
    public static int piece(int[] block, int number) {
        int flag = 0;
        for (int numbers : block) {
            if (numbers == number) {
                flag++;
            }
        }
        return flag;
    }
//      It returns the index at which the searched element is found in the array.
    public static int search(int[] block, int number) {
        int index = -1;
        int i;
        for (i = 0; i < block.length && block[i] != number; i++) {
        }
        ;
        if (i < block.length) {
            index = i;
        }
        return index;
    }
//      It reverses the order of elements in the array.
    public static void arrayTurn(int[] block) {
        int last = block.length - 1;
        for (int i = 0; i < block.length / 2; i++) {
            int tmp = block[i];
            block[i] = block[last - i];
            block[last - i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {32, 56, 1, 3, 78, 59, 99, 45};
        int[] numbers2 = {12, 3, 87, 26, 98, 59, 4, 100};
        int test = 99;

        blockOut(numbers1);
        blockOut(numbers2);
        System.out.println();
        blockOut(addTo(numbers1, 1200));
        blockOut(remove(numbers1, 5));
        blockOut(exchange(numbers1, 2, 199));
        blockOut(insert(numbers2, 4, 999));
        blockOut(pruned(numbers1, numbers2));
        blockOut(union(numbers1, numbers2));
        System.out.println(piece(numbers1, test));
        System.out.println(search(numbers1, 3));
        arrayTurn(numbers1);
        blockOut(numbers1);
    }
}