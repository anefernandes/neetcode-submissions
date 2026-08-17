class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
/*

Lógica:
Utilizar busca binária para encontrar o limite inferior (lower bound). Pensar que existem dois arrays e vamos buscar o início do segundo array ordenado.

Evitar Pitfalls:
Compare sempre com o da direita, pois será início ou final de um possível segundo segmento.

right = mid, mantém o mid porque ele ainda pode ser o mínimo.

left = mid + 1, elimina o mid porque sabemos que ele não pode ser o mínimo

*/