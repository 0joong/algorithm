package mysort.sort;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList); //before after비교 위해 호출
		quickSort(sortedData, 0, sortedData.length - 1);
	}

	// 퀵 정렬 메서드: 배열의 start부터 end까지 정렬
	void quickSort(int[] dataList, int start, int end) {
		if (start >= end) return; // base condition 설정, 요소가 1개인 경우.
		int p = partition(dataList, start, end); // 배열을 분리하기 위한 partition 설정
		quickSort(dataList, start, p - 1); // 왼쪽 배열 정렬
		quickSort(dataList, p + 1, end); // 오른쪽 배열 정렬
	}

	// 분할 메서드: 배열을 피벗을 기준으로 두 부분으로 나누고, 피벗의 최종 위치를 반환
	int partition(int[] dataList, int start, int end) {
		int pivot = dataList[end]; //피벗으로 배열 끝 요소 선택(어떤 요소 골라도 상관없음?)
		int leftEnd = start - 1; // 왼쪽 배열의 끝 인덱스
		for (int i = start; i <= end - 1 ; i++) {
			if (dataList[i] < pivot) { // 현재 요소가 피벗보다 작은 경우
				swap(dataList, ++leftEnd, i); //조상 클래스 swap 호출
			}
		}
		swap(dataList, leftEnd + 1, end); // 피벗을 왼쪽 부분 배열의 끝 다음에 위치
		return leftEnd + 1; // 피벗의 최종 위치를 반환
	}
}