package Homework4.StringReverser;

class StringReverser implements StringManipulation {
    @Override
    public String manipulateString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}

