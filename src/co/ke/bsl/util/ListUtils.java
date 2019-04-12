package co.ke.bsl.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListUtils {
	public static <T> List<T> getRandomSubSelection(List<T> sourceList, int itemsToSelect, Random random) {
		int sourceSize = sourceList.size();
		if (sourceSize != 0 && itemsToSelect > 0 && sourceSize >= itemsToSelect) {
			int[] selections = new int[itemsToSelect];
			ArrayList<T> resultArray = new ArrayList();

			for (int count = 0; count < itemsToSelect; ++count) {
				int selection = random.nextInt(sourceSize - count);
				selections[count] = selection;

				for (int scanIdx = count - 1; scanIdx >= 0; --scanIdx) {
					if (selection >= selections[scanIdx]) {
						++selection;
					}
				}

				resultArray.add(sourceList.get(selection));
			}

			return resultArray;
		} else {
			throw new IllegalArgumentException();
		}
	}
}