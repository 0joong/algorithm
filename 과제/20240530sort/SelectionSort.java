package mysort.sort;

public class SelectionSort extends Sort {
	
	@Override
	public void sort(int[] dataList) {
		setData(dataList);//원본 데이터 저장
		for (int last = sortedData.length-1; last >= 1; last--) {//last = 정렬 안 된 부분의 제일 큰 index 고로 초기값은 length-1
			int maxIndex = selectMax(sortedData, last);//maxindex
			if (maxIndex != last)//최댓값 index랑 last(정렬 안 된 부분 가장 오른쪽)랑 값이 다를 경우 swap
				swap(sortedData, maxIndex, last);
		}
	}
	
	int selectMax(int[] dataList, int last) {//정렬 안 된 부분에서 최댓값 index 찾는 함수
		int max = dataList[0];//값 범위에 상관없이 최댓값을 구하기 위해 첫번째 요소로 기준점 설정
		int maxIndex = 0;
		
		for (int i = 1 ; i <= last; i++) {//최대값? 최댓값? 찾는 함수
			if (dataList[i] > max) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	
}
