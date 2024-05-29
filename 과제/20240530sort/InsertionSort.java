package mysort.sort;

public class InsertionSort extends Sort {

	// 삽입 정렬 메서드
	@Override
	public void sort(int[] dataList) {
		// 원본 데이터를 저장
		setData(dataList);

		// 배열의 두 번째 요소부터 마지막 요소까지 반복
		for (int i = 1; i < sortedData.length; i++) {
			// 현재 요소가 위치할 올바른 위치를 찾음
			int loc = findLessFromLast(sortedData, sortedData[i], i - 1);
			// 올바른 위치가 현재 위치와 다르면 데이터를 삽입
			if (loc != i - 1)
				insertData(sortedData, loc + 1, i);
		}
	}

	// 배열에 데이터를 삽입하는 함수
	// (배열 주소, 넣을 인덱스, 넣을 값의 인덱스)
	private void insertData(int[] dataList, int target, int source) {
		int temp = dataList[source]; // 삽입할 값을 임시로 저장
		// 값을 삽입하기 위해 요소들을 이동
		for (int i = source; i > target; i--) {
			dataList[i] = dataList[i - 1];
		}
		// 목표 위치에 값을 삽입
		dataList[target] = temp;
	}

	// 마지막 인덱스까지의 배열에서 주어진 데이터보다 작거나 같은 값을 찾는 함수
	private int findLessFromLast(int[] dataList, int data, int last) {
		// 마지막 인덱스부터 처음까지 역순으로 탐색
		for (int i = last; i >= 0; i--) {
			// 데이터보다 작거나 같은 값을 찾으면 그 인덱스를 반환
			if (dataList[i] <= data) return i;
		}
		// 없으면 -1 반환
		return -1;
	}
}
