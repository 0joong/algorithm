package mysort.sort;

public class BubbleSort extends Sort {

	@Override//override annotation
	public void sort(int[] dataList) {
		setData(dataList);//before after 비교 위해 호출
		// 마지막 요소부터 첫 번째 요소까지 반복
		for (int last = sortedData.length - 1; last >= 1; last--) {
			for (int i = 0; i <= last - 1; i++) { // 배열의 첫 요소부터 현재 마지막 요소의 이전 요소까지 반복
				if (sortedData[i] > sortedData[i + 1]) // 현재 요소가 다음 요소보다 큰 경우
					swap(sortedData, i, i + 1); //교환, 조상 클래스 swap 상속 받아 사용
			}
		}

	}

}
