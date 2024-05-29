package mysort.sort;

import java.util.Arrays;

public class MergeSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList); // 원본 데이터를 저장하고 정렬할 배열을 초기화
		mergeSort(sortedData, 0, sortedData.length - 1); // 병합 정렬 시작
	}

	// 병합 정렬 메서드: 배열의 start부터 end까지 정렬
	void mergeSort(int[] dataList, int start, int end) {
		if (start >= end) return; // base case: 배열이 하나의 요소만을 가지면 이미 정렬된 상태이므로 return

		int mid = (start + end) / 2; // 배열을 두 부분으로 분할
		mergeSort(dataList, start, mid); // 첫 번째 부분을 재귀적으로 정렬
		mergeSort(dataList, mid + 1, end); // 두 번째 부분을 재귀적으로 정렬
		merge(dataList, start, mid, end); // 두 부분을 병합
	}

	// 병합 메서드: 두 부분 배열을 병합하여 정렬된 배열을 만듦
	void merge(int[] dataList, int start, int mid, int end) {
		int[] tempList = new int[end - start + 1]; // 병합 결과를 저장할 임시 배열
		int i = start;
		int j = mid + 1;
		int k = 0; // 두 부분 배열의 시작 인덱스와 임시 배열의 인덱스 초기화

		// 두 부분 배열을 병합
		while (i <= mid && j <= end) {
			if (dataList[i] <= dataList[j]) // 첫 번째 배열의 요소가 작거나 같으면
				tempList[k++] = dataList[i++]; // 첫 번째 배열의 요소를 임시 배열에 추가
			else
				tempList[k++] = dataList[j++]; // 두 번째 배열의 요소를 임시 배열에 추가
		}

		// 첫 번째 배열의 남은 요소를 임시 배열에 추가
		while (i <= mid) tempList[k++] = dataList[i++];
		// 두 번째 배열의 남은 요소를 임시 배열에 추가
		while (j <= end) tempList[k++] = dataList[j++];

		// 임시 배열의 요소를 원본 배열에 복사
		System.arraycopy(tempList, 0, dataList, start, end - start + 1);
	}
}
