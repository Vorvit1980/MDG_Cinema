package dev.barmaglot.com.mdg_cinema;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class  ExpandFragment extends Fragment {

    private ExpandableListView mExpandableListView;
    private List<Group> myGroupCollection;


    public ExpandFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myGroupCollection = new ArrayList<Group>();

        for (int i = 1; i < 6; i++) {
            Group group = new Group();
            group.Name = "День" + i;
            Time time = new Time(Time.getCurrentTimezone());
            time.set(0, 0, 0, 26, 12, 2017);
            group.time = time;

            for (int j = 1; j < 5; j++) {
                Group.Item item = group.new Item();
                item.Name = "Сеанс" + j;
                Time time1 = new Time(Time.getCurrentTimezone());
                time1.set(0, 30, 15, 0, 0, 0);
                item.time = time1;
                group.GroupItemCollection.add(item);
            }

            myGroupCollection.add(group);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //View view = inflater.inflate(R.layout.fragment_expand, container, false);


        //mExpandableListView = view.findViewById(R.id.expandableListView);
        ExpandableListAdapter adapter = new ExpandableListAdapter(getActivity().getApplicationContext(),
                mExpandableListView, myGroupCollection);


        mExpandableListView.setAdapter(adapter);

        for (int i = 0; i < myGroupCollection.size(); i++) {
            mExpandableListView.expandGroup(i);
        }


        return null;
    }


    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private Context context;
        private ExpandableListView expandableListView;
        private List<Group> groupCollection;
        private int[] groupStatus;
        private static final int LENGTH = 5;

        public ExpandableListAdapter(Context context,
                                     ExpandableListView expandableListView,
                                     List<Group> groupCollection) {
            this.context = context;
            this.groupCollection = groupCollection;
            this.expandableListView = expandableListView;
            groupStatus = new int[groupCollection.size()];


            setListEvent();
        }

        private void setListEvent() {

            expandableListView
                    .setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

                        @Override
                        public void onGroupExpand(int groupPosition) {
                            // TODO Auto-generated method stub
                            groupStatus[groupPosition] = 1;
                        }
                    });

            expandableListView
                    .setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

                        @Override
                        public void onGroupCollapse(int groupPosition) {
                            // TODO Auto-generated method stub
                            groupStatus[groupPosition] = 0;
                        }
                    });
        }

        @Override
        public String getChild(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return groupCollection.get(groupPosition).GroupItemCollection.get(childPosition).Name;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
                                 ViewGroup viewGroup) {
            // TODO Auto-generated method stub

            ChildHolder childHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(
                        R.layout.list_group_item, null);

                childHolder = new ChildHolder();

                childHolder.titleTextView = (TextView) convertView.findViewById(R.id.item_title);
                childHolder.timeTextView = (TextView) convertView.findViewById(R.id.item_time);
                convertView.setTag(childHolder);
            } else {
                childHolder = (ChildHolder) convertView.getTag();
            }

            childHolder.titleTextView.setText(groupCollection.get(groupPosition).GroupItemCollection.get(childPosition).Name);
            childHolder.timeTextView.setText(groupCollection.get(groupPosition).GroupItemCollection.get(childPosition).time.hour +
                    ":" + groupCollection.get(groupPosition).GroupItemCollection.get(childPosition).time.minute);
            return convertView;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            // TODO Auto-generated method stub
            return groupCollection.get(groupPosition).GroupItemCollection.size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            // TODO Auto-generated method stub
            return groupCollection.get(groupPosition);
        }

        @Override
        public int getGroupCount() {
            // TODO Auto-generated method stub
            return LENGTH;
        }

        @Override
        public long getGroupId(int groupPosition) {
            // TODO Auto-generated method stub
            return groupPosition;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup viewGroup) {
            // TODO Auto-generated method stub
            GroupHolder groupHolder;
            if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.list_group,
                        null);
                groupHolder = new GroupHolder();
                groupHolder.StrelkaImg = (ImageView) view.findViewById(R.id.tag_img);
                groupHolder.titleTextView = (TextView) view.findViewById(R.id.group_title);
                groupHolder.dateTextView = (TextView) view.findViewById(R.id.group_date);
                view.setTag(groupHolder);
            } else {
                groupHolder = (GroupHolder) view.getTag();
            }
            if (groupStatus[groupPosition] == 0) {
                groupHolder.StrelkaImg.setImageResource(R.drawable.group_down);
            } else {
                groupHolder.StrelkaImg.setImageResource(R.drawable.group_up);
            }
            groupHolder.titleTextView.setText(groupCollection.get(groupPosition).Name);
            groupHolder.dateTextView.setText(groupCollection.get(groupPosition).time.monthDay + "." +
                    groupCollection.get(groupPosition).time.month);

            return view;
        }

        class GroupHolder {
            ImageView StrelkaImg;
            TextView titleTextView;
            TextView dateTextView;
        }

        class ChildHolder {
            TextView titleTextView;
            TextView timeTextView;
        }

        @Override
        public boolean hasStableIds() {
            // TODO Auto-generated method stub
            return true;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return true;
        }

    }


}
