# PinnedSectionListView

<img src="https://github.com/jinkg/Screenshots/blob/master/PinnedSectionListView/pinned_section_listview_screen_shot.gif" width="180" height="320">

## Usage

```xml
<com.yalin.pinnedsectionlistview.PinnedSectionListView
        android:id="@+id/pinned_list_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:divider="@null" />
```

```java
PinnedSectionListView pinnedSectionListView = (PinnedSectionListView) findViewById(R.id.pinned_list_view);
pinnedSectionListView.setShadowVisible(true);
pinnedSectionListView.setAdapter(mAdapter);
```

You can see a complete usage in the demo app.

## Feedback

nilaynij@gmail.com.
